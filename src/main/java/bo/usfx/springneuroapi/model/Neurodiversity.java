package bo.usfx.springneuroapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "neurodiversities")
public class Neurodiversity {
    @Id
    private String id;
    private String name;
    private String description;
    private String worldWidePercentage;
    private String basicExplanationLink;
    private String testLink;

    public final String getId() {
        return id;
    }

    public final void setId(final String id) {
        this.id = id;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String description) {
        this.description = description;
    }

    public final String getWorldWidePercentage() {
        return worldWidePercentage;
    }

    public final void setWorldWidePercentage(final String worldWidePercentage) {
        this.worldWidePercentage = worldWidePercentage;
    }

    public final String getBasicExplanationLink() {
        return basicExplanationLink;
    }

    public final void setBasicExplanationLink(final String basicExplanationLink) {
        this.basicExplanationLink = basicExplanationLink;
    }

    public final String getTestLink() {
        return testLink;
    }

    public final void setTestLink(final String testLink) {
        this.testLink = testLink;
    }
}
