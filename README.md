# 🎙️ Spring AI Audio Transcription Service

Transform your audio data into actionable text with ease. This application provides a robust, production-ready interface for high-accuracy speech-to-text processing, powered by **Spring Boot** and **OpenAI’s Whisper** models.

## 🌟 What This App Does

Beyond just "code," this service acts as a bridge between raw audio media and text-based data analysis. Whether you are building a tool for meeting notes, a content search engine, or an automated subtitle generator, this service handles the heavy lifting of audio processing.

### ✨ Key Capabilities

* **Dynamic File Processing**: Accept real-time audio uploads from users via high-performance REST endpoints.
* **Intelligent Transcription**: Fine-tune AI output using custom "Prompts" to guide the AI in understanding specific terminology or context.
* **Multi-Language Support**: Explicitly define languages for more accurate localizations.
* **Precision Control**: Adjust "Temperature" settings to balance between literal transcriptions and creative interpretations.
* **Automated Workflows**: Includes internal resource processing for handling pre-recorded system files or templates.

## 🛠️ Technical Core

* **AI Engine**: OpenAI Whisper (via Spring AI).
* **Runtime**: Java 21 & Spring Boot 3.x.
* **API Design**: Clean, RESTful architecture for easy integration with frontend frameworks like React or Vue.

## 🚀 Getting Started

### 1. Set Your Credentials

Export your API key to your environment:

```bash
export OPENAI_API_KEY='your_key_here'

```

### 2. Available Endpoints

| Feature | Endpoint | Method |
| --- | --- | --- |
| **Direct Upload** | `/api/v1/audio/text` | `POST` |
| **System Processing** | `/api/v1/audio/transcript` | `POST` |
| **Optimized Transcription** | `/api/v1/audio/transcript-with-options` | `POST` |

### 3. Example Request

```bash
curl -X POST http://localhost:8083/api/v1/audio/text \
  -H "Content-Type: multipart/form-data" \
  -F "audioFile=@my_recording.mp3"

```

## 📈 Future Use Cases

* **Searchable Archives**: Transcribe podcasts or lectures to make them searchable.
* **Accessibility**: Generate captions for audio content to assist the hearing impaired.
* **AI Analysis**: Feed the generated text into LLMs (like GPT-4) for summarization or sentiment analysis.
