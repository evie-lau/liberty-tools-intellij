/*******************************************************************************
 * Copyright (c) 2023 Red Hat Inc. and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *
 * Contributors:
 *     Red Hat Inc. - initial API and implementation
 *******************************************************************************/
package io.openliberty.tools.intellij.lsp4mp.lsp4ij.lifecycle;

import java.util.Collections;

/**
 * Language server lifecycle manager which does nothing.
 */
public class NullLanguageServerLifecycleManager extends LanguageServerLifecycleManager {

    public static final LanguageServerLifecycleManager INSTANCE = new NullLanguageServerLifecycleManager();

    private NullLanguageServerLifecycleManager() {
        super(Collections.emptyList());
    }
}
