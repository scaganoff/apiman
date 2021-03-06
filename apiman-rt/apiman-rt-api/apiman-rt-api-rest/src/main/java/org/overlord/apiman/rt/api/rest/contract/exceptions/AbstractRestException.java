/*
 * Copyright 2014 JBoss Inc
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

package org.overlord.apiman.rt.api.rest.contract.exceptions;

import org.overlord.apiman.rt.engine.beans.exceptions.AbstractEngineException;


/**
 * Base class for all APIMan errors coming out of the runtime REST layer.
 *
 * @author eric.wittmann@redhat.com
 */
public abstract class AbstractRestException extends AbstractEngineException {
    
    private static final long serialVersionUID = -5141061454310276468L;

    /**
     * Constructor.
     */
    public AbstractRestException() {
    }
    
    /**
     * Constructor.
     * @param message
     */
    public AbstractRestException(String message) {
        super(message);
    }
    
    /**
     * Constructor.
     * @param cause
     */
    public AbstractRestException(Throwable cause) {
        super(cause);
    }

}
