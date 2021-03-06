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
 ******************************************************************************/
package org.eclipse.kura.bluetooth;

import java.util.List;
import java.util.UUID;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @noimplement This interface is not intended to be implemented by clients.
 *
 * @deprecated This class is deprecated in favor of {@link org.eclipse.kura.bluetooth.le.BluetoothLeGattService}
 *
 */
@ProviderType
@Deprecated
public interface BluetoothGattService {

    /*
     * Get characteristic based on UUID
     */
    public BluetoothGattCharacteristic getCharacteristic(UUID uuid);

    /*
     * Get list of characteristics of the service
     */
    public List<BluetoothGattCharacteristic> getCharacterisitcs();

    /*
     * Return the UUID of this service
     */
    public UUID getUuid();

    public String getStartHandle();

    public String getEndHandle();

}
