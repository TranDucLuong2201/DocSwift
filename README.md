# DocSwift

## Overview
DocSwift is a mobile application designed to streamline doctor-patient communication and appointment scheduling. The app provides a user-friendly interface for patients to book appointments, message doctors, view health records, and more, enhancing healthcare accessibility and efficiency.

## Key Features
- **Appointment Booking**: CRUD app. Patients can easily schedule appointments with doctors.
- **Messaging**: Secure and direct communication between patients and doctors.
- **Health Records**: Display vital patient health metrics in a clear format.
- **Doctor Management**: Tools for doctors to manage their profiles and schedules.
- **Hospital Information**: Detailed data about hospitals, including navigation via Google Maps.
- **Payments**: Seamless integration for online payments.
- **Authentication**: User authentication is handled securely using Firebase Authentication.

## Getting Started

### Prerequisites
- Android Studio (latest version recommended)
- Kotlin language setup
- Firebase account with Firebase Authentication enabled
- Internet access

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/TranDucLuong2201/DocSwift.git
   ```
2. Open the project in Android Studio.
3. Sync the Gradle files.
4. Add the `.env` file to `app/src/main/res/` with the required environment variables (e.g., `WEB_CLIENT_ID`, `API_URL`).
5. Set up Firebase for the project:
   - Go to the [Firebase Console](https://console.firebase.google.com/).
   - Create a new project or use an existing one.
   - Enable Firebase Authentication and download the `google-services.json` file.
   - Place the `google-services.json` file in the `app/` directory.
6. Build and run the app on an emulator or physical device.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements
We would like to express our gratitude to **jhalokde@gmail.com** for providing the Figma design template, which served as the foundation for the DocSwift project.

## Author
- Tran Duc Luong - Sole Developer

---
**Project Start Date**: March 1, 2025  
**Version**: 1.0.0

