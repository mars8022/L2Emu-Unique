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
package interpreter.shortcut;

import eu.revengineer.simplejse.HasScriptDependencies;

/**
 * Interprets the given byte/word/dword as a legacy shortcut's slot.
 * 
 * @author _dev_
 */
@HasScriptDependencies("interpreter.shortcut.ShortcutSlot")
public class ShortcutSlotBase10 extends ShortcutSlot
{
	/** Constructs this interpreter. */
	public ShortcutSlotBase10()
	{
		super(10);
	}
}
