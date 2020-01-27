package org.carlspring.strongbox.artifact.coordinates;

import org.carlspring.strongbox.artifact.coordinates.versioning.SemanticVersion;
import org.carlspring.strongbox.db.schema.Vertices;
import org.carlspring.strongbox.gremlin.adapters.LayoutArtifactCoordinatesArapter;
import org.springframework.stereotype.Component;

/**
 * @author sbespalov
 */
@Component
public class NpmArtifactCoordinatesAdapter
        extends LayoutArtifactCoordinatesArapter<NpmArtifactCoordinates, SemanticVersion>
{

    public NpmArtifactCoordinatesAdapter()
    {
        super(Vertices.NPM_ARTIFACT_COORDINATES, NpmArtifactCoordinates.class);
    }

}