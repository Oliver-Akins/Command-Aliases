package oliver.cmdAliases.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.TextComponent;
import oliver.cmdAliases.CommandAliasesConfig;
import oliver.cmdAliases.CommandAliasesPlugin;
import systems.conduit.main.core.commands.BaseCommand;
import systems.conduit.main.core.plugin.annotation.PluginMeta;

/**
 * @author Oliver
 * @since 2020/12/14
 */
public class CACommand extends BaseCommand {
	private PluginMeta meta;

	public CACommand(PluginMeta meta) {
		this.meta = meta;
	}

	@Override
	public LiteralArgumentBuilder<CommandSourceStack> getCommand() {
		return Commands.literal("CA")
				.then(Commands.literal("info")
						.executes(source -> {
							TextComponent response = new TextComponent(
									this.meta.name()
									+ "\nAuthor: " + this.meta.author()
									+ "\nVersion: " + this.meta.version()
									+ "\nDescription: " + this.meta.description()
							);
							source.getSource().sendSuccess(response, false);
							return 1;
						})
				);
	}
}
