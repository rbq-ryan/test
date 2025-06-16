<template>
  <div>
    <h2>Login</h2>
    <form @submit.prevent="login">
      <input v-model="username" placeholder="Username" />
      <input v-model="password" type="password" placeholder="Password" />
      <button type="submit">Login</button>
    </form>
  </div>
</template>
<script>
import axios from 'axios';
export default {
  data() {
    return { username: '', password: '' };
  },
  methods: {
    login() {
      axios.post('/login', { username: this.username, password: this.password })
        .then(() => this.$router.push('/'));
    }
  }
};
</script>
