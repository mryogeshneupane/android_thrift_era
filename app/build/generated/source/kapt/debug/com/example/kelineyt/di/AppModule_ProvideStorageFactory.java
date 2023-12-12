// Generated by Dagger (https://dagger.dev).
package com.example.kelineyt.di;

import com.google.firebase.storage.StorageReference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideStorageFactory implements Factory<StorageReference> {
  @Override
  public StorageReference get() {
    return provideStorage();
  }

  public static AppModule_ProvideStorageFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StorageReference provideStorage() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideStorage());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideStorageFactory INSTANCE = new AppModule_ProvideStorageFactory();
  }
}
