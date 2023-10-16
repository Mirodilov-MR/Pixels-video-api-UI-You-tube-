// Generated by Dagger (https://dagger.dev).
package com.ytp.pixe.pixels.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_GetcontextFactory implements Factory<Context> {
  private final Provider<Context> getcontexttProvider;

  public AppModule_GetcontextFactory(Provider<Context> getcontexttProvider) {
    this.getcontexttProvider = getcontexttProvider;
  }

  @Override
  public Context get() {
    return getcontext(getcontexttProvider.get());
  }

  public static AppModule_GetcontextFactory create(Provider<Context> getcontexttProvider) {
    return new AppModule_GetcontextFactory(getcontexttProvider);
  }

  public static Context getcontext(Context getcontextt) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.getcontext(getcontextt));
  }
}