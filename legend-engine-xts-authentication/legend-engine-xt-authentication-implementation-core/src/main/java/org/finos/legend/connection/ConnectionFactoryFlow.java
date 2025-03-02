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

package org.finos.legend.connection;

import org.finos.legend.engine.shared.core.identity.Credential;

public interface ConnectionFactoryFlow<T, SPEC extends ConnectionSpecification<T>, CRED extends Credential>
{
    Class<SPEC> getConnectionSpecificationClass();

    Class<CRED> getCredentialClass();

    T getConnection(SPEC connectionSpecification, CRED credential) throws Exception;

    default T configureConnection(T connection, SPEC connectionSpecification, CRED credential) throws Exception
    {
        throw new UnsupportedOperationException(String.format("Configuring connection is not supported in the connection setup flow for Specification=%s, Credential=%s",
                this.getConnectionSpecificationClass().getSimpleName(),
                this.getCredentialClass().getSimpleName())
        );
    }
}
