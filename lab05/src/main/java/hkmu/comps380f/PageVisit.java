package hkmu.comps380f;

import java.io.Serializable;
import java.net.InetAddress;

public class PageVisit implements Serializable {
    private long enteredTimestamp;
    private Long leftTimestamp;
    String request;
    InetAddress ipAddress;

    public PageVisit() {
    }

    public long getEnteredTimestamp() {
        return enteredTimestamp;
    }

    public void setEnteredTimestamp(long enteredTimestamp) {
        this.enteredTimestamp = enteredTimestamp;
    }

    public Long getLeftTimestamp() {
        return leftTimestamp;
    }

    public void setLeftTimestamp(Long leftTimestamp) {
        this.leftTimestamp = leftTimestamp;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public InetAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(InetAddress ipAddress) {
        this.ipAddress = ipAddress;
    }
}
