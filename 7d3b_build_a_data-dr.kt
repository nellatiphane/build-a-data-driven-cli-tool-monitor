Kotlin
data class MonitorConfig(
    val name: String,
    val hosts: List<String>,
    val port: Int,
    val username: String,
    val password: String,
    val interval: Long, // in milliseconds
    val timeout: Long // in milliseconds
)

data class Metric(
    val name: String,
    val value: Double,
    val unit: String
)

data class MonitoringData(
    val config: MonitorConfig,
    val metrics: List<Metric>,
    val timestamp: Long // in milliseconds
)

data class Alert(
    val message: String,
    val severity: String
)

data class MonitoringResult(
    val data: MonitoringData,
    val alerts: List<Alert>
)