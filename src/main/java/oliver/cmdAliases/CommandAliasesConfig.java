package oliver.cmdAliases;

import lombok.Getter;
import lombok.NoArgsConstructor;
import systems.conduit.main.core.plugin.config.Configuration;
import systems.conduit.main.core.plugin.config.annotation.ConfigFile;

/**
 * @author Oliver
 * @since 2020/12/14
 */
@ConfigFile(
		name = "CommandAliases",
		type = "json",
		defaultFile = "plugins/CommandAliases/config.json"
)
@NoArgsConstructor
public class CommandAliasesConfig extends Configuration {
	@Getter
	@NoArgsConstructor
	private class Alias {
		private String name;
		private String context;
		private String permission;
		private String[] commands;
	}

	@Getter private Alias[] aliases;
	@Getter private boolean caCommand;
}
