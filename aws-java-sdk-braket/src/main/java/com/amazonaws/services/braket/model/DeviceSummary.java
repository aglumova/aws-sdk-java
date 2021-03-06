/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Includes information about the device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/DeviceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the device.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The name of the device.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The status of the device.
     * </p>
     */
    private String deviceStatus;
    /**
     * <p>
     * The type of the device.
     * </p>
     */
    private String deviceType;
    /**
     * <p>
     * The provider of the device.
     * </p>
     */
    private String providerName;

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @return The ARN of the device.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @param deviceName
     *        The name of the device.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @return The name of the device.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @param deviceName
     *        The name of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @param deviceStatus
     *        The status of the device.
     * @see DeviceStatus
     */

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @return The status of the device.
     * @see DeviceStatus
     */

    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @param deviceStatus
     *        The status of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public DeviceSummary withDeviceStatus(String deviceStatus) {
        setDeviceStatus(deviceStatus);
        return this;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @param deviceStatus
     *        The status of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public DeviceSummary withDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of the device.
     * </p>
     * 
     * @param deviceType
     *        The type of the device.
     * @see DeviceType
     */

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The type of the device.
     * </p>
     * 
     * @return The type of the device.
     * @see DeviceType
     */

    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * <p>
     * The type of the device.
     * </p>
     * 
     * @param deviceType
     *        The type of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceType
     */

    public DeviceSummary withDeviceType(String deviceType) {
        setDeviceType(deviceType);
        return this;
    }

    /**
     * <p>
     * The type of the device.
     * </p>
     * 
     * @param deviceType
     *        The type of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceType
     */

    public DeviceSummary withDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType.toString();
        return this;
    }

    /**
     * <p>
     * The provider of the device.
     * </p>
     * 
     * @param providerName
     *        The provider of the device.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The provider of the device.
     * </p>
     * 
     * @return The provider of the device.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The provider of the device.
     * </p>
     * 
     * @param providerName
     *        The provider of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getDeviceStatus() != null)
            sb.append("DeviceStatus: ").append(getDeviceStatus()).append(",");
        if (getDeviceType() != null)
            sb.append("DeviceType: ").append(getDeviceType()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceSummary == false)
            return false;
        DeviceSummary other = (DeviceSummary) obj;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getDeviceStatus() == null ^ this.getDeviceStatus() == null)
            return false;
        if (other.getDeviceStatus() != null && other.getDeviceStatus().equals(this.getDeviceStatus()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDeviceStatus() == null) ? 0 : getDeviceStatus().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        return hashCode;
    }

    @Override
    public DeviceSummary clone() {
        try {
            return (DeviceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.DeviceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
