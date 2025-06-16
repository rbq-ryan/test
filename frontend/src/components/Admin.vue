<template>
  <div>
    <h2>Admin Panel</h2>
    <form @submit.prevent="addBook">
      <input v-model="title" placeholder="Title" />
      <input v-model="author" placeholder="Author" />
      <button type="submit">Add</button>
    </form>
  </div>
</template>
<script>
import axios from 'axios';
export default {
  data() {
    return { title: '', author: '' };
  },
  methods: {
    addBook() {
      axios.post('/books', { title: this.title, author: this.author })
        .then(() => { this.title=''; this.author=''; });
    }
  }
};
</script>
