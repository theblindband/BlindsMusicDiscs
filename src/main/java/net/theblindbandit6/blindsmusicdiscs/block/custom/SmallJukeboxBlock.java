package net.theblindbandit6.blindsmusicdiscs.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.JukeboxBlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SmallJukeboxBlock extends JukeboxBlock {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    //Voxel shapes for each direction and if there's a disc in the jukebox
    protected static final VoxelShape SHAPE_NS_EMPTY = Block.createCuboidShape(1, 0, 2, 15, 3, 14);
    protected static final VoxelShape SHAPE_EW_EMPTY = Block.createCuboidShape(2, 0, 1, 14, 3, 15);
    protected static final VoxelShape SHAPE_NS_DISC = Block.createCuboidShape(1, 0, 2, 15, 5, 14);
    protected static final VoxelShape SHAPE_EW_DISC = Block.createCuboidShape(2, 0, 1, 14, 5, 15);


    public SmallJukeboxBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState) this.stateManager.getDefaultState()
                .with(HAS_RECORD, false).with(FACING, Direction.NORTH)));
    }

    //Sets the block shape based on the FACING state
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

    //Sets the FACING state to opposite where the player is facing
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)((BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite()));
    }

    //Adds FACING and HAS_RECORD to the block
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, HAS_RECORD);
    }

    //This code stops the block throwing an error for ticking however the block still doesn't count ticks while playing
    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        if (type != BlockEntityType.JUKEBOX) {
                return SmallJukeboxBlock.validateTicker(type, BlockEntityType.JUKEBOX, JukeboxBlockEntity::tick);
        }
        return null;
    }
}
