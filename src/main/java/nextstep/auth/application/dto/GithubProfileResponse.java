package nextstep.auth.application.dto;

public class GithubProfileResponse {
    private String email;

    public GithubProfileResponse(String email) {
        this.email = email;
    }

    public static GithubProfileResponse of(GithubResponses githubResponses) {
        return new GithubProfileResponse(githubResponses.getEmail());
    }

    public String getEmail() {
        return email;
    }
}
