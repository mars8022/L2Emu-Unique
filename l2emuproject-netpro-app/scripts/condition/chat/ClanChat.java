/*
 * Copyright 2011-2015 L2EMU UNIQUE
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package condition.chat;

import net.l2emuproject.proxy.script.condition.ScriptedIntegerEqualityCondition;

/**
 * Tests whether the value of a byte/word/dword is equal to 4.<BR>
 * <BR>
 * Used to check the type of chat in <TT>ChatMessage</TT>.
 * 
 * @author _dev_
 */
public class ClanChat extends ScriptedIntegerEqualityCondition
{
	/** Constructs this condition. */
	public ClanChat()
	{
		super(4);
	}
}
