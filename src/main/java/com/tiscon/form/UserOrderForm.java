package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {
    @NotBlank
    private String customerName_sei;

    @NotBlank
    private String customerName_mei;

    @NotBlank
    private String customerName_sei_kana;

    @NotBlank
    private String customerName_mei_kana;

    @NotBlank
    @Numeric
    private String tel;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String oldPrefectureId;

    @NotBlank
    private String oldAddress;

    @NotBlank
    private String newPrefectureId;

    @NotBlank
    private String newAddress;

    @Numeric
    @NotBlank
    private String box;

    @Numeric
    @NotBlank
    private String bed;

    @Numeric
    @NotBlank
    private String bicycle;

    @Numeric
    @NotBlank
    private String washingMachine;

    @NotNull
    private boolean washingMachineInstallation;

    private String tel2;

    public String getCustomerName_sei() {
        return customerName_sei;
    }

    public void setCustomerName_sei(String customerName_sei) {
        this.customerName_sei = customerName_sei;
    }

    public String getCustomerName_mei() {
        return customerName_mei;
    }

    public void setCustomerName_mei(String customerName_mei) {
        this.customerName_mei = customerName_mei;
    }

    public String getCustomerName_sei_kana() {
        return customerName_sei_kana;
    }

    public void setCustomerName_sei_kana(String customerName_sei_kana) {
        this.customerName_sei_kana = customerName_sei_kana;
    }

    public String getCustomerName_mei_kana() {
        return customerName_mei_kana;
    }

    public void setCustomerName_mei_kana(String customerName_mei_kana) {
        this.customerName_mei_kana = customerName_mei_kana;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }
    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }
}
