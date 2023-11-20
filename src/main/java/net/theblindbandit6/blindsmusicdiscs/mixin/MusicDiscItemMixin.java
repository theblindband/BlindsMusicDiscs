package net.theblindbandit6.blindsmusicdiscs.mixin;

import net.minecraft.block.*;
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
import net.theblindbandit6.blindsmusicdiscs.util.ModTags;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MusicDiscItem.class)
public class MusicDiscItemMixin
		extends Item {
	public MusicDiscItemMixin(Item.Settings settings) {super(settings);}

	//Overrides the useOnBlock method in the MusicDiscItem class
	//This has been changed to make music discs check for the Jukeboxes tag rather than specifically the Jukebox block
	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {
		BlockPos blockPos;
		World world = context.getWorld();
		BlockState blockState = world.getBlockState(blockPos = context.getBlockPos());
		if(!world.getBlockState(blockPos).isIn(ModTags.Blocks.JUKEBOXES) || blockState.get(JukeboxBlock.HAS_RECORD).booleanValue()){
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