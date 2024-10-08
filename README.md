**Установка**
------------

### Требования

* Java 
* Spring Boot 
* Gradle

### Установка зависимостей

Добавьте следующие зависимости в файл `build.gradle`:
```groovy
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-validation'
}
```

**Использование API**
=====================

### Endpoints

#### POST /api/services

Создает новый Сервис.

* **Запрос**: `Service` объект (JSON)
* **Ответ**: `Service` объект (JSON)

#### GET /api/services

Возвращает список сервисов.

* **Ответ**: Список `Service` объектов (JSON)

#### GET /api/services/{id}

Возвращает сервис по идентификатору.

* **Параметр**: `id` (long)
* **Ответ**: `Service` объект (JSON)

#### PUT /api/services/{id}

Обновляет сервис.

* **Параметр**: `id` (long)
* **Запрос**: `Service` объект (JSON)
* **Ответ**: `Service` объект (JSON)

#### DELETE /api/services/{id}

Удаляет сервис.

* **Параметр**: `id` (long)

### Параметры запроса

#### Service

* `id`: идентификатор сервиса (long)
* `name`: имя сервиса (string)
* `description`: описание сервиса (string)
* `documentationLink`: ссылка на документацию (string)
* `swaggerLink`: ссылка на Swagger (string)

### Пример запроса

```bash
curl -X POST \
  http://localhost:8080/api/services \
  -H 'Content-Type: application/json' \
  -d '{"name": "Service", "description": "Service description"}'
```
### Пример ответа

```json
{
  "id": 1,
  "name": "test",
  "description": "Service description",
  "documentationLink": null,
  "swaggerLink": null
  
}
```
