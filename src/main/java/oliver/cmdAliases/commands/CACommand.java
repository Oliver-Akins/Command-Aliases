package oliver.cmdAliases.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.TextComponent;
import systems.conduit.main.core.commands.BaseCommand;

public class InfoCommand extends BaseCommand {
	@Override
	public LiteralArgumentBuilder<CommandSourceStack> getCommand() {
		return Commands
				.literal("CA")
				.then(Commands.literal("info")
						.executes(source -> {
							TextComponent response = new TextComponent("CommandAliases -> Hello there");
							source.getSource().sendSuccess(response, false);
							return 1;
						})
				);
	}
}
