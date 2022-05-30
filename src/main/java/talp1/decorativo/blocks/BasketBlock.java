package talp1.decorativo.blocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BasketBlock extends HorizontalFacingBlock {
    private static final VoxelShape HORIZONTAL = Block.createCuboidShape(2.5D, 0.0D, 1.0D, 13.5D, 7.5D, 14.0D);
    private static final VoxelShape VERTICAL = Block.createCuboidShape(1.0D, 0.0D, 2.5D, 14.0D, 7.50D, 13.5D);

    public BasketBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = (Direction)state.get(FACING);
        return direction.getAxis() == Direction.Axis.X ? VERTICAL : HORIZONTAL;
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing().rotateYClockwise());
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }
}

