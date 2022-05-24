package cntt61.thanh61134360.model;

import java.io.Serializable;

public class BaiTho implements Serializable {
    private int iD;
    private String tieuDe, toiDung, tacGia;

    public BaiTho() {
    }

    public BaiTho(int iD, String tieuDe, String toiDung, String tacGia) {
        this.iD = iD;
        this.tieuDe = tieuDe;
        this.toiDung = toiDung;
        this.tacGia = tacGia;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getToiDung() {
        return toiDung;
    }

    public void setToiDung(String toiDung) {
        this.toiDung = toiDung;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
}
