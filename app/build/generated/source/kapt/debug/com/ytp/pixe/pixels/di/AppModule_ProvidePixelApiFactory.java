// Generated by Dagger (https://dagger.dev).
package com.ytp.pixe.pixels.di;

import com.ytp.pixe.pixels.PixelApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidePixelApiFactory implements Factory<PixelApi> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvidePixelApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PixelApi get() {
    return providePixelApi(retrofitProvider.get());
  }

  public static AppModule_ProvidePixelApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvidePixelApiFactory(retrofitProvider);
  }

  public static PixelApi providePixelApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePixelApi(retrofit));
  }
}
