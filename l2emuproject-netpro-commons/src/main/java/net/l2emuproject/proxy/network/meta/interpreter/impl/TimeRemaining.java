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
package net.l2emuproject.proxy.network.meta.interpreter.impl;

import java.util.concurrent.TimeUnit;

import net.l2emuproject.proxy.network.meta.interpreter.IntegerInterpreter;
import net.l2emuproject.proxy.state.entity.context.ICacheServerID;
import net.l2emuproject.util.TimeAmountInterpreter;

/**
 * Interprets the given byte/word/dword as time remaining in seconds.
 * 
 * @author savormix
 */
public class TimeRemaining implements IntegerInterpreter
{
	@Override
	public Object getInterpretation(long value, ICacheServerID entityCacheContext)
	{
		return TimeAmountInterpreter.consolidate(value, TimeUnit.SECONDS, TimeUnit.SECONDS, TimeUnit.DAYS, "N/A");
	}
}
