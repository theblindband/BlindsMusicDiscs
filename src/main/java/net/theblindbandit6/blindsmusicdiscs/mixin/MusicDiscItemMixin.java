package net.theblindbandit6.blindsmusicdiscs.mixin;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.JukeboxBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.theblindbandit6.blindsmusicdiscs.block.ModBlocks;
import net.theblindbandit6.blindsmusicdiscs.block.custom.SmallJukebox;
import org.spongepowered.asm.mixin.Mixin;

import java.util.Map;
import java.util.Optional;

@Mixin(MusicDiscItem.class)
public class MusicDiscItemMixin
		extends Item {
	public MusicDiscItemMixin(Item.Settings settings) {super(settings);}

	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {
		BlockPos blockPos;
		World world = context.getWorld();
		BlockState blockState = world.getBlockState(blockPos = context.getBlockPos());
		if     (!blockState.isOf(Blocks.JUKEBOX)                   &&
				!blockState.isOf(ModBlocks.SMALL_OAK_JUKEBOX)      && //When adding a new small jukebox add it to this list to let it work
				!blockState.isOf(ModBlocks.SMALL_BIRCH_JUKEBOX)    &&
				!blockState.isOf(ModBlocks.SMALL_SPRUCE_JUKEBOX)   &&
				!blockState.isOf(ModBlocks.SMALL_JUNGLE_JUKEBOX)   &&
				!blockState.isOf(ModBlocks.SMALL_ACACIA_JUKEBOX)   &&
				!blockState.isOf(ModBlocks.SMALL_DARK_OAK_JUKEBOX) &&
				!blockState.isOf(ModBlocks.SMALL_MANGROVE_JUKEBOX) &&
				!blockState.isOf(ModBlocks.SMALL_CHERRY_JUKEBOX)   &&
				!blockState.isOf(ModBlocks.SMALL_CRIMSON_JUKEBOX)  &&
				!blockState.isOf(ModBlocks.SMALL_WARPED_JUKEBOX)
				|| blockState.get(SmallJukebox.HAS_RECORD).booleanValue()) {
			return ActionResult.PASS;
		}
		ItemStack itemStack = context.getStack();
		if (!world.isClient) {
			PlayerEntity playerEntity = context.getPlayer();
			BlockEntity blockEntity = world.getBlockEntity(blockPos);
			if (blockEntity instanceof JukeboxBlockEntity) {
				JukeboxBlockEntity jukeboxBlockEntity = (JukeboxBlockEntity)blockEntity;
				jukeboxBlockEntity.setStack(itemStack.copy());
				world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, blockState));
			}
			itemStack.decrement(1);
			if (playerEntity != null) {
				playerEntity.incrementStat(Stats.PLAY_RECORD);
			}
		}
		return ActionResult.success(world.isClient);
	}
}