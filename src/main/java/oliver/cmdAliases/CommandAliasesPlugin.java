package oliver.cmdAliases;

import oliver.cmdAliases.commands.*;
import systems.conduit.main.Conduit;
import systems.conduit.main.core.plugin.Plugin;
import systems.conduit.main.core.plugin.annotation.PluginMeta;

import java.util.Optional;

/**
 * @author Oliver
 * @since 2020/12/13
 */
@PluginMeta(
		name = "CommandAliases",
		version = "0.1.0",
		description = "Allows aliasing a sequence of commands to a single command. With per-alias permission nodes for all your player management needs.",
		author = "Oliver Akins",
		reloadable = true,
		config = CommandAliasesConfig.class
)
public class CommandAliasesPlugin extends Plugin {
	@Override
	protected void onEnable() {
		PluginMeta meta = getMeta();
		Optional<CommandAliasesConfig> conf = getConfig();
		if (conf == null) {
			Conduit.getLogger().warn("Cannot intialize Command Aliases without a config file.");
		}
		Conduit.getLogger().info("Loading CommandAliases");
		registerCommands(new CACommand(meta));
	}

	@Override
	protected void onDisable() {

	}
}