/**
 * Copyright 2016 William Van Woensel

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 * 
 * 
 * @author wvw
 * 
 */
package wvw.mobibench.config.data;

import wvw.utils.EnumUtils;

public enum DataFormats {

	RDF, Datalog, Nools, RDFQuery, mTableaux;

	public int getId() {
		return ordinal();
	}

	public String getLabel() {
		return EnumUtils.getLabel(this);
	}

	public static DataFormats getEnum(String label) {
		return (DataFormats) EnumUtils.getEnum(values(), label);
	}

	public static DataFormats getEnum(int id) {
		return (DataFormats) EnumUtils.getEnum(values(), id);
	}
}
