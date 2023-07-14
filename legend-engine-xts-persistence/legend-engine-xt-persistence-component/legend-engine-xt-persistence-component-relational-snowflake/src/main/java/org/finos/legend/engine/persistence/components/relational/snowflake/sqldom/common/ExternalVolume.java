// Copyright 2023 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.persistence.components.relational.snowflake.sqldom.common;

import org.finos.legend.engine.persistence.components.relational.sqldom.SqlGen;

public class ExternalVolume implements SqlGen
{
    private String externalVolume;

    public ExternalVolume(String externalVolume)
    {
        this.externalVolume = externalVolume;
    }

    @Override
    public void genSql(StringBuilder builder)
    {
        builder.append(String.format("with EXTERNAL_VOLUME = '%s'", externalVolume));
    }
}