/**
 * Copyright (C) 2016 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.strata.data;

import java.io.Serializable;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.opengamma.strata.basics.currency.FxMatrix;

/**
 * Identifies the market data for an FX matrix.
 */
@BeanDefinition(builderScope = "private", cacheHashCode = true)
public final class FxMatrixId
    implements MarketDataId<FxMatrix>, ImmutableBean, Serializable {

  /**
   * The standard identifier.
   */
  private static final FxMatrixId STANDARD = new FxMatrixId(ObservableSource.NONE);

  /**
   * The source of observable market data.
   * This is used when looking up the underlying market quotes for the rate.
   */
  @PropertyDefinition(validate = "notNull")
  private final ObservableSource observableSource;

  //-------------------------------------------------------------------------
  /**
   * Obtains an instance representing an FX matrix.
   *
   * @return an identifier for the FX matrix
   */
  public static FxMatrixId standard() {
    return STANDARD;
  }

  /**
   * Obtains an instance representing an FX matrix, specifying the source.
   *
   * @param observableSource  the source of the observable market data used to create the rate
   * @return an identifier for the FX matrix
   */
  public static FxMatrixId of(ObservableSource observableSource) {
    return new FxMatrixId(observableSource);
  }

  //-------------------------------------------------------------------------
  @Override
  public Class<FxMatrix> getMarketDataType() {
    return FxMatrix.class;
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code FxMatrixId}.
   * @return the meta-bean, not null
   */
  public static FxMatrixId.Meta meta() {
    return FxMatrixId.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(FxMatrixId.Meta.INSTANCE);
  }

  /**
   * The serialization version id.
   */
  private static final long serialVersionUID = 1L;

  /**
   * The cached hash code, using the racy single-check idiom.
   */
  private int cachedHashCode;

  private FxMatrixId(
      ObservableSource observableSource) {
    JodaBeanUtils.notNull(observableSource, "observableSource");
    this.observableSource = observableSource;
  }

  @Override
  public FxMatrixId.Meta metaBean() {
    return FxMatrixId.Meta.INSTANCE;
  }

  @Override
  public <R> Property<R> property(String propertyName) {
    return metaBean().<R>metaProperty(propertyName).createProperty(this);
  }

  @Override
  public Set<String> propertyNames() {
    return metaBean().metaPropertyMap().keySet();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the source of observable market data.
   * This is used when looking up the underlying market quotes for the rate.
   * @return the value of the property, not null
   */
  public ObservableSource getObservableSource() {
    return observableSource;
  }

  //-----------------------------------------------------------------------
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      FxMatrixId other = (FxMatrixId) obj;
      return JodaBeanUtils.equal(observableSource, other.observableSource);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = cachedHashCode;
    if (hash == 0) {
      hash = getClass().hashCode();
      hash = hash * 31 + JodaBeanUtils.hashCode(observableSource);
      cachedHashCode = hash;
    }
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(64);
    buf.append("FxMatrixId{");
    buf.append("observableSource").append('=').append(JodaBeanUtils.toString(observableSource));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code FxMatrixId}.
   */
  public static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code observableSource} property.
     */
    private final MetaProperty<ObservableSource> observableSource = DirectMetaProperty.ofImmutable(
        this, "observableSource", FxMatrixId.class, ObservableSource.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "observableSource");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 1793526590:  // observableSource
          return observableSource;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends FxMatrixId> builder() {
      return new FxMatrixId.Builder();
    }

    @Override
    public Class<? extends FxMatrixId> beanType() {
      return FxMatrixId.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code observableSource} property.
     * @return the meta-property, not null
     */
    public MetaProperty<ObservableSource> observableSource() {
      return observableSource;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 1793526590:  // observableSource
          return ((FxMatrixId) bean).getObservableSource();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code FxMatrixId}.
   */
  private static final class Builder extends DirectFieldsBeanBuilder<FxMatrixId> {

    private ObservableSource observableSource;

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 1793526590:  // observableSource
          return observableSource;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 1793526590:  // observableSource
          this.observableSource = (ObservableSource) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public Builder set(MetaProperty<?> property, Object value) {
      super.set(property, value);
      return this;
    }

    @Override
    public Builder setString(String propertyName, String value) {
      setString(meta().metaProperty(propertyName), value);
      return this;
    }

    @Override
    public Builder setString(MetaProperty<?> property, String value) {
      super.setString(property, value);
      return this;
    }

    @Override
    public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
      super.setAll(propertyValueMap);
      return this;
    }

    @Override
    public FxMatrixId build() {
      return new FxMatrixId(
          observableSource);
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(64);
      buf.append("FxMatrixId.Builder{");
      buf.append("observableSource").append('=').append(JodaBeanUtils.toString(observableSource));
      buf.append('}');
      return buf.toString();
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}