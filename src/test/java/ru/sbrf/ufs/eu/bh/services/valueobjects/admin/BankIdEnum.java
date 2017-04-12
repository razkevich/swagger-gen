package ru.sbrf.ufs.eu.bh.services.valueobjects.admin;

public enum BankIdEnum {
    SBCZ,
    SBHR,
    SBRF,
    SBDE,
    SBAT,
    SBBY;

    private BankIdEnum() {
    }

    public static BankIdEnum getEnumFromCode(String code) {
        return valueOf(code);
    }
}
