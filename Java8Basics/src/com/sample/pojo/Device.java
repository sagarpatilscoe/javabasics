package com.sample.pojo;

public class Device {

	private String deviceName;
	private Long deviceId;
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public Long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}
	public Device(String deviceName, Long deviceId) {
		super();
		this.deviceName = deviceName;
		this.deviceId = deviceId;
	}
	@Override
	public String toString() {
		return "Device [deviceName=" + deviceName + ", deviceId=" + deviceId + "]";
	}
	
	
}
