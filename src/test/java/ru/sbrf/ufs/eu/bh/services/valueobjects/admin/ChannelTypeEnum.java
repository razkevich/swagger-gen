//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sbrf.ufs.eu.bh.services.valueobjects.admin;

public enum ChannelTypeEnum {
    ATM("ATM"),
    CNP("CNP"),
    POS("POS"),
    BRANCH("BRANCH"),
    MOBILE_BANK("MOBILE"),
    INTERNET_BANK("INTERNET"),
    HOME_BANKING("HOMEBANKING"),
    MULTICASH("MULTICASH"),
    HCE("HCE"),
    HCE_TO_MCP("HCE_TO_MCP"),
    MTOKEN("MTOKEN");

    private String code;

    public String getCode() {
        return this.code;
    }

    private ChannelTypeEnum(String inputCode) {
        this.code = inputCode;
    }

    public static ChannelTypeEnum getByCode(String code) {
        ChannelTypeEnum[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            ChannelTypeEnum channelType = var1[var3];
            if (channelType.getCode().equals(code)) {
                return channelType;
            }
        }

        return null;
    }
}
