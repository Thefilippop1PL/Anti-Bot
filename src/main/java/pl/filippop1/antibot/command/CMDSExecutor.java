/*
 * Copyright 2015 Aleksander.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.filippop1.antibot.command;

import org.bukkit.command.CommandSender;
import pl.themolka.cmds.command.CommandException;

/**
 *
 * @author Aleksander
 */
public class CMDSExecutor extends pl.themolka.cmds.command.Command {
    public CMDSExecutor() {
        super(new String[] {"anti-bot", "antibot", "ab"});
        this.setDescription("Zarzadzanie pluginem AntiBot");
        this.setUsage("help - aby uzyskac pomoc");
    }
    
    @Override
    public void handle(CommandSender sender, String label, String[] args) throws CommandException {
        if (args.length == 0) {
            CommandExecutor.get().execute(sender, new String[] {"help"});
        } else {
            CommandExecutor.get().execute(sender, args);
        }
    }
}
