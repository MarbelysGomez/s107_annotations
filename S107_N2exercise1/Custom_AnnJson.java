package s107_annotations.S107_N2exercise1;
@JsonSerialize(directory = "D:\\IdeaProjects\\s1_Java_Language\\src\\main\\java\\s107_annotations\\S107_N2exercise1")
public class Custom_AnnJson {
    private String data;
    public Custom_AnnJson(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
}
