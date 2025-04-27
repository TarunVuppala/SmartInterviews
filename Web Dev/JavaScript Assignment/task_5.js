function evaluateConditions(obj) {
  if (obj.age > 18 && obj.hasLicense) {
    return "Eligible to drive";
  }
  if (obj.temperature > 30 || obj.humidity > 70) {
    return "Warning: High discomfort level";
  }
  if ((obj.role === "admin" || obj.role === "editor") && obj.isActive) {
    return "Access granted";
  }

  if (!obj.isVerified) {
    return "User not verified";
  }
  if (obj.score >= 90 && obj.attendance > 75) {
    return "Eligible for honors";
  }
  if (obj.itemsInCart > 0 && !obj.isGuest) {
    return "Proceed to checkout";
  }
  if (obj.subscription === "premium" && obj.usage < obj.quota) {
    return "Premium access active";
  }
  return "No conditions met";
}


console.log(evaluateConditions({ age: 21, hasLicense: true }));
console.log(evaluateConditions({ temperature: 34, humidity: 73 }));