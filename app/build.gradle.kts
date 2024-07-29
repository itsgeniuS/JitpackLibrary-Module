plugins {
	alias(libs.plugins.android.application)
	alias(libs.plugins.jetbrains.kotlin.android)

	id("maven-publish") //add this publish support plugin
}

android {
	namespace = "com.genius.jitpacklibrary_module"
	compileSdk = 34

	defaultConfig {
		applicationId = "com.genius.jitpacklibrary_module"
		minSdk = 24
		targetSdk = 34
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
		vectorDrawables {
			useSupportLibrary = true
		}
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
				"proguard-rules.pro"
			)
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_17
		targetCompatibility = JavaVersion.VERSION_17
	}
	kotlinOptions {
		jvmTarget = "17"
	}
	buildFeatures {
		compose = true
	}
	composeOptions {
		kotlinCompilerExtensionVersion = "1.5.1"
	}
	packaging {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}

	}

	publishing {
		singleVariant("release") {
			withSourcesJar()
			withJavadocJar()
		}
	}

	configure<PublishingExtension> {
		publications.create<MavenPublication>(ConfigData.PublishingData.ARTIFACT_ID) {

			groupId = ConfigData.PublishingData.GROUP_ID
			artifactId = ConfigData.PublishingData.ARTIFACT_ID
			version = ConfigData.PublishingData.RELEASE_VERSION
			artifact(ConfigData.PublishingData.ARTIFACT_PATH)

			pom {
				name = ConfigData.PublicationData.PUBLISHER_NAME
				description = ConfigData.PublicationData.PUBLISHER_DESCRIPTION
				url = ConfigData.PublicationData.PUBLISHER_URL

				developers {
					name = ConfigData.PublisherData.AUTHOR_NAME
					description = ConfigData.PublisherData.AUTHOR_EMAIL
					organization {
						url = ConfigData.PublisherData.AUTHOR_PORTFOLIO
					}
				}
			}
		}
	}
}

dependencies {
	implementation(project(":utils"))

	implementation(libs.androidx.core.ktx)
	implementation(libs.androidx.lifecycle.runtime.ktx)
	implementation(libs.androidx.activity.compose)
	implementation(platform(libs.androidx.compose.bom))
	implementation(libs.androidx.ui)
	implementation(libs.androidx.ui.graphics)
	implementation(libs.androidx.ui.tooling.preview)
	implementation(libs.androidx.material3)
	testImplementation(libs.junit)
	androidTestImplementation(libs.androidx.junit)
	androidTestImplementation(libs.androidx.espresso.core)
	androidTestImplementation(platform(libs.androidx.compose.bom))
	androidTestImplementation(libs.androidx.ui.test.junit4)
	debugImplementation(libs.androidx.ui.tooling)
	debugImplementation(libs.androidx.ui.test.manifest)
}