public enum FileSignature {
    JPG("jpg", new byte[]{ (byte)0xFF,(byte)0xD8 }),
    GIF("gif", new byte[]{(byte)0x47,(byte)0x49, (byte)0x46, (byte)0x38, (byte)0x39, (byte)0x61}),
    CLASS("class",new byte[]{ (byte)0xCA, (byte)0xFE, (byte)0xBA, (byte)0xBE });

    private String type;
    private byte[] signatureArray;

    FileSignature(String type, byte[] signatureArray) {
        this.type = type;
        this.signatureArray = signatureArray;
    }

    public boolean check(byte[] arr){
        for (int i = 0; i < signatureArray.length; i++) {
            if(arr[i]!=signatureArray[i]) return false;
        }
        return true;
    }

    public String getType() {
        return type;
    }
}
