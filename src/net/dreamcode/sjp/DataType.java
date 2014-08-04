package net.dreamcode.sjp;

/**
 * Copyright
 */
public enum DataType {

    STRING("Ljava/lang/String;"),
    INTEGER("I");

    private final String jvmType;

    DataType(String jvmType) {
        this.jvmType = jvmType;
    }

    public String getJvmType() {

        return jvmType;
    }
}
