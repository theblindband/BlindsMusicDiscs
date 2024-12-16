package net.theblindbandit6.blindsmusicdiscs.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.JukeboxPlayableComponent;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.theblindbandit6.blindsmusicdiscs.block.custom.entity.SmallJukeboxBlockEntity;
import org.jetbrains.annotations.Nullable;

public class SmallJukeboxBlock extends BlockWithEntity {
    public static final MapCodec<JukeboxBlock> CODEC = createCodec(JukeboxBlock::new);
    public static final BooleanProperty HAS_RECORD = Properties.HAS_RECORD;
    public static final EnumProperty<Direction> FACING = HorizontalFacingBlock.FACING;
    //Voxel shapes for each direction and if there's a disc in the jukebox
    protected static final VoxelShape SHAPE_NS_EMPTY = Block.createCuboidShape(1, 0, 2, 15, 3, 14);
    protected static final VoxelShape SHAPE_EW_EMPTY = Block.createCuboidShape(2, 0, 1, 14, 3, 15);
    protected static final VoxelShape SHAPE_NS_DISC = Block.createCuboidShape(1, 0, 2, 15, 5, 14);
    protected static final VoxelShape SHAPE_EW_DISC = Block.createCuboidShape(2, 0, 1, 14, 5, 15);

    @Override
    public MapCodec<JukeboxBlock> getCodec() {
        return CODEC;
    }

    public SmallJukeboxBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(HAS_RECORD, Boolean.valueOf(false)).with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (!(state.get(HAS_RECORD))) {
            switch (state.get(FACING)) {
                case EAST, WEST:
                    return SHAPE_EW_DISC;
                default:
                    return SHAPE_NS_DISC;
            }
        }else{
            switch (state.get(FACING)) {
                case EAST, WEST:
                    return SHAPE_EW_EMPTY;
                default:
                    return SHAPE_NS_EMPTY;
            }
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        NbtComponent nbtComponent = itemStack.getOrDefault(DataComponentTypes.BLOCK_ENTITY_DATA, NbtComponent.DEFAULT);
        if (nbtComponent.contains("RecordItem")) {
            world.setBlockState(pos, state.with(HAS_RECORD, Boolean.valueOf(true)), Block.NOTIFY_LISTENERS);
        }
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if ((Boolean)state.get(HAS_RECORD) && world.getBlockEntity(pos) instanceof SmallJukeboxBlockEntity jukeboxBlockEntity) {
            jukeboxBlockEntity.dropRecord();
            return ActionResult.SUCCESS;
        } else {
            return ActionResult.PASS;
        }
    }

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if ((Boolean)state.get(HAS_RECORD)) {
            return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
        } else {
            ItemStack itemStack = player.getStackInHand(hand);
            ActionResult actionResult = JukeboxPlayableComponent.tryPlayStack(world, pos, itemStack, player);
            return (ActionResult)(!actionResult.isAccepted() ? ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION : actionResult);
        }
    }

    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            if (world.getBlockEntity(pos) instanceof SmallJukeboxBlockEntity jukeboxBlockEntity) {
                jukeboxBlockEntity.dropRecord();
            }

            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SmallJukeboxBlockEntity(pos, state);
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        if (world.getBlockEntity(pos) instanceof SmallJukeboxBlockEntity jukeboxBlockEntity && jukeboxBlockEntity.getManager().isPlaying()) {
            return 15;
        }

        return 0;
    }

    @Override
    protected boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    @Override
    protected int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return world.getBlockEntity(pos) instanceof SmallJukeboxBlockEntity jukeboxBlockEntity ? jukeboxBlockEntity.getComparatorOutput() : 0;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HAS_RECORD, FACING);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return /*state.get(HAS_RECORD) ? BlockWithEntity.validateTicker(type, ModBlockEntityTypes.SMALL_JUKEBOX_BLOCK_ENTITY, SmallJukeboxBlockEntity::tick) :*/ null;
    }
}
