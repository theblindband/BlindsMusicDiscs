package net.theblindbandit6.blindsmusicdiscs.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.JukeboxPlayableComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.theblindbandit6.blindsmusicdiscs.block.custom.SmallJukeboxBlock;
import net.theblindbandit6.blindsmusicdiscs.block.custom.entity.SmallJukeboxBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.theblindbandit6.blindsmusicdiscs.util.ModTags;

@Mixin(JukeboxPlayableComponent.class)
public class JukeboxPlayableComponentMixin {
	@Inject(at = @At("HEAD"), method = "tryPlayStack", cancellable = true)
	private static void init(World world, BlockPos pos, ItemStack stack, PlayerEntity player, CallbackInfoReturnable<ActionResult> cir) {
		JukeboxPlayableComponent jukeboxPlayableComponent = stack.get(DataComponentTypes.JUKEBOX_PLAYABLE);
		if (jukeboxPlayableComponent == null) {
			cir.setReturnValue(ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION);
		} else {
			BlockState blockState = world.getBlockState(pos);
			if (blockState.isIn(ModTags.Blocks.JUKEBOXES) && !(Boolean)blockState.get(SmallJukeboxBlock.HAS_RECORD)) {
				if (!world.isClient) {
					ItemStack itemStack = stack.splitUnlessCreative(1, player);
					if (world.getBlockEntity(pos) instanceof SmallJukeboxBlockEntity jukeboxBlockEntity) {
						jukeboxBlockEntity.setStack(itemStack);
						world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
					}

					player.incrementStat(Stats.PLAY_RECORD);
				}

				cir.setReturnValue(ActionResult.SUCCESS);
			} else {
				cir.setReturnValue(ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION);
			}
		}
	}
}