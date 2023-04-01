package nl.bergthaler.ddz.mixin.example.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import nl.bergthaler.ddz.mixin.example.ddz;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		ddz.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
