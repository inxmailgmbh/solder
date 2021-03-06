/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.solder.messages;

import java.util.Locale;

/**
 * A converter for a specific parameter type.
 * 
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 * @param <I> the input type
 */
public interface ParameterConverter<I> {

    /**
     * Convert the parameter to its string or string-equivalent representation. The returned value will be passed in as a
     * parameter to either a {@link java.text.MessageFormat} or {@link java.util.Formatter} instance, depending on the setting
     * of {@link Message#format()}.
     * 
     * @param locale the locale
     * @param parameter the parameter
     * @return the converted value
     */
    Object convert(Locale locale, I parameter);
}