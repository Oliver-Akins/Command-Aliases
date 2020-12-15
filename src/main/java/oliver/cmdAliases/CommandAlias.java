package oliver.cmdAliases;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.TextComponent;
import systems.conduit.main.core.commands.BaseCommand;

import java.util.ArrayList;

public class CommandAlias extends BaseCommand {
	private String alias;
	private ArrayList<String> commands;
	private String permission;
	private String context;

	public CommandAlias() {}

	@Override
	public LiteralArgumentBuilder<CommandSourceStack> getCommand() {
		return Commands
				.literal(alias)
				.executes(ctx -> {
						TextComponent response = new TextComponent("CommandAliases -> Hello there");
						ctx.getSource().sendSuccess(response, false);
						return 1;
				});
	}
}
