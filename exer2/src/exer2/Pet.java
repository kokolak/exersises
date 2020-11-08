package exer2;

public class Pet {
   private String nickname;
   private String type;

    @Override
    public String toString() {
        return "Pet{" + "nickname=" + nickname + ", type=" + type + '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
