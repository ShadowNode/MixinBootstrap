package io.github.lxgaming.mixin.launch;

import net.minecraftforge.fml.loading.moddiscovery.ModsFolderLocator;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;

public class CustomModsFolderLocator extends ModsFolderLocator {
    private final Path modFolder;
    private final String customName;

    public CustomModsFolderLocator() {
        this(new File(CustomModsFolderLocator.class.getProtectionDomain().getCodeSource().getLocation().getPath()).toPath().getParent().resolve("custom").resolve("mods"));
    }

    CustomModsFolderLocator(Path modFolder) {
        this(modFolder, "Custom Mods");
    }

    public CustomModsFolderLocator(Path modFolder, String name) {
        this.modFolder = modFolder;
        this.customName = name;
    }

    public String name() {
        return this.customName;
    }

    public String toString() {
        return "{" + this.customName + " locator at " + this.modFolder + "}";
    }

    public void initArguments(Map<String, ?> arguments) {
    }
}
