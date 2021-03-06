/*******************************************************************************
 * Copyright (c) 2011, 2020 Eurotech and/or its affiliates and others
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Eurotech
 *******************************************************************************/
package org.eclipse.kura.net.admin.modem;

public enum PppState {

    NOT_CONNECTED(0),
    IN_PROGRESS(1),
    CONNECTED(2);

    private int state = 0;

    private PppState(int state) {
        this.state = state;
    }

    public int getState() {
        return this.state;
    }
}
