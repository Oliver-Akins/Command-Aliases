package oliver.cmdAliases;

import oliver.cmdAliases.commands.InfoCommand;
import systems.conduit.main.core.plugin.Plugin;
import systems.conduit.main.core.plugin.annotation.PluginMeta;

/**
 * @author oliver
 * @since 2020/12/13
 */
@PluginMeta(
		name = "CommandAliases",
		version = "0.1.0",
		description = "Alias a sequence of commands to a single command. With per-command permission nodes.",
		author = "Oliver Akins",
		reloadable = true)
public class CommandAliasesPlugin extends Plugin {
	@Override
	protected void onEnable() {
		registerCommands(new InfoCommand());
	}

	@Override
	protected void onDisable() {

	}
}