package day15_0903.test;

/**
 * api的基本信息
 * @author Administrator
 */
public class ApiInfo {
    private String apiId;
    private String apiName;
    private String url;
    private String type;

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ApiInfo [apiId=" + apiId + ", apiName=" + apiName + ", url=" + url + ", type=" + type + "]";
    }

}
