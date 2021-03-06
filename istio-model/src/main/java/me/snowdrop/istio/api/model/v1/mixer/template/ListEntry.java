/**
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 * <p>
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package me.snowdrop.istio.api.model.v1.mixer.template;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Doneable;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.Inline;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import me.snowdrop.istio.api.model.IstioBaseSpec;

/**
 * @author <a href="claprun@redhat.com">Christophe Laprun</a>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "me.snowdrop.istio.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class ListEntry extends IstioBaseSpec {
    private String value;

    @Override
    public String getKind() {
        return "listentry";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
