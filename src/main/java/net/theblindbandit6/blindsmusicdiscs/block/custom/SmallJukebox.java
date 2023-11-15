package net.theblindbandit6.blindsmusicdiscs.block.custom;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SmallJukebox extends JukeboxBlock {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    protected static final VoxelShape SHAPE_NS_EMPTY = Block.createCuboidShape(1, 0, 2, 15, 3, 14);
    protected static final VoxelShape SHAPE_EW_EMPTY = Block.createCuboidShape(2, 0, 1, 14, 3, 15);
    protected static final VoxelShape SHAPE_NS_DISC = Block.createCuboidShape(1, 0, 2, 15, 5, 14);
    protected static final VoxelShape SHAPE_EW_DISC = Block.createCuboidShape(2, 0, 1, 14, 5, 15);


    public SmallJukebox(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState())
                .with(FACING, Direction.NORTH).with(HAS_RECORD, false)));
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
        return (BlockState)((BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite()));
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HAS_RECORD, FACING);
    }
}
