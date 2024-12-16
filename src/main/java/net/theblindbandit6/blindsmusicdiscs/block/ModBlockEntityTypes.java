package net.theblindbandit6.blindsmusicdiscs.block;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.theblindbandit6.blindsmusicdiscs.BlindsMusicDiscs;
import net.theblindbandit6.blindsmusicdiscs.block.custom.entity.SmallJukeboxBlockEntity;

public class ModBlockEntityTypes {
    public static <T extends BlockEntityType<?>> T register(String path, T blockEntityType) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(BlindsMusicDiscs.MOD_ID, path), blockEntityType);
    }

    public static final BlockEntityType<SmallJukeboxBlockEntity> SMALL_JUKEBOX_BLOCK_ENTITY = register(
            "small_jukebox_block_entity", FabricBlockEntityTypeBuilder.create(SmallJukeboxBlockEntity::new,
                            ModBlocks.SMALL_OAK_JUKEBOX)
                    .build()
    );

    public static void register() {
    }
}
